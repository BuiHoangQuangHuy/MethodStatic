package basic.dev;

import java.util.Scanner;

import com.sun.net.httpserver.Authenticator.Result;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	
		float x;
		int k;
		double sum = 0;
		int i = 0;
		
		
		System.out.println("Nhap x = ");
		x = sc.nextFloat();
		System.out.println("Nhap k = ");
		k = sc.nextInt();
		
		while((Math.pow(x, i)/factorial(i)) >= (1/Math.pow(10, k))){
			sum += (Math.pow(x, i)/factorial(i));
			i++;
		}
		System.out.println("Bai 15.1 ham e^x:");
		System.out.println("e^x= "  + String.format("%.4g%n", Math.exp(x)));
		System.out.println("result = " + String.format("%.4g%n", sum));
		System.out.println("Bang nhau");
	
	
	System.out.println("-------------------------");
	System.out.println("Bai 15.2: Ham 1/(1+x^3)");
	
	
	i=1;
	sum = 0;
	int iplus=2;
	int iminus = 0;
	
	while(((i*iplus)/2)*Math.pow(x, iminus) >= (1/Math.pow(10, k)) ) {
		if(i % 2 == 1) {
			sum +=  ((i*iplus)/2)*Math.pow(x, iminus);
		} else {
			sum -=  ((i*iplus)/2)*Math.pow(x, iminus);
		}
		i++;
		iminus++;
		iplus++;
	}
	
	
	System.out.println(" 1 / (1+x)^3 = " + String.format("%.3g%n",  1/Math.pow((1+x), 3)));
	System.out.println("result = " + String.format("%.3g%n", sum));
	System.out.println(" Bang nhau ");
	

	System.out.println("-------------------------");
	System.out.println("Bai 15.3: Ham ln(1-x)");
	
	i=1;
	sum = 0;
	
	while((Math.pow(x, i)/i) >= (1/Math.pow(10, k))) {
		sum-= Math.pow(x, i)/i;
		i++;
	}
	
	System.out.println("ln(1-x) = " + String.format("%.3g%n", Math.log(1-x)));
	System.out.println("result = " + String.format("%.3g%n", sum));
	
	
	System.out.println("---------------");
	System.out.println("Bai 15.4 Can (1 + x)");
	
	int ile = 1;
	int ichan = 2;
	i = 1;
	sum = 1;
	
	while((float)(tichLe(ile)/tichChan(ichan))*Math.pow(x, i) >= (1/Math.pow(10, k))) {
		
		if(i%2==0) {
			sum -= (tichLe(ile)/tichChan(ichan))*Math.pow(x, i);
		}else {
			sum += (tichLe(ile)/tichChan(ichan))*Math.pow(x, i);
		}
		if(i==1 && ile==1 && ichan == 2) {
			ichan +=2;
			i++;
		}else {
			ile +=2;
			ichan +=2;
			i++;
		}
		
	}
	System.out.println("1/can(1+x) = " + String.format("%.4g%n", (Math.sqrt(1+x))));
	System.out.println("result = " + String.format("%.4g%n", sum));
	
	
	
	System.out.println("------------------");
	System.out.println("Bai 15.5: 1 chia can (1+x)");
	
	ile = 1;
	ichan = 2;
	i = 1;
	sum = 1;
	
	while((float)(tichLe(ile)/tichChan(ichan))*Math.pow(x, i) >= (1/Math.pow(10, k))) {
		if(i%2 == 1) {
			sum -= (tichLe(ile)/tichChan(ichan))*Math.pow(x, i);
		} else {
			sum += (tichLe(ile)/tichChan(ichan))*Math.pow(x, i);
		  }
		ile +=2;
		ichan +=2;
		i++;
	}
	System.out.println("1/can(1+x) = " + String.format("%.3g%n", 1 / (Math.sqrt(1+x))));
	System.out.println("result = " + String.format("%.3g%n", sum));
	
	}
	
	static long factorial(int a) {
		int result = 1;
		if(a == 0) {
			result = 1;
		} else {
			for (int i = 1; i <= a ; i++) {
			result = result *i;
			}
		 }
		return result;
	}
	static float tichChan(int a) {
		int resutl = 1;
		for (int i = 2; i <= a; i = i +2) {
			resutl = resutl*i;
		}
		return resutl;
	}
	static float tichLe(int a) {
		int result = 1;
		for (int i = 1; i <= a; i+=2) {
			result = result * i;
		}
		return result;
	}

}
