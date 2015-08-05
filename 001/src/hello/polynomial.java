package hello;

import java.util.Scanner;

public class polynomial {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("please enter number of terms: ");
		int cnt = in.nextInt();
		
		int [] power = new int[cnt];
		int [] factor = new int[cnt];

		System.out.print("please enter power and factor: (n m)");
		
//		将输入数据存入两个数组，并同时判断是否系数等于0和判断是否刚刚输入的幂与之前输入的幂相同，相同则将刚刚输入的系数加入之前的系数
		MAIN_LOOP:
		for (int i = 0; i < power.length; i++){
			int power_number = in.nextInt();
			int factor_number = in.nextInt();
			if (factor_number == 0){
//				i = i -1;
				continue MAIN_LOOP;
			}
			for (int k = 0; k<i; k++){
				if (power[k] == power_number){
					factor[k] = factor[k] + factor_number;
//					i = i -1;
					continue MAIN_LOOP;
				} 
			}
			power [i] = power_number;
			factor [i] = factor_number;
		}
		
		for (int n = 0; n<power.length; n++){
			if ((factor[n] != 0) && (power[n] !=0)){
				if (n != (power.length - 1)) {
					System.out.print(power[n] + "x" + factor[n] + "+");
				} else {
					System.out.print(power[n] + "x" + factor[n]);
				}
			} else if ((factor[n] != 0) && (power[n] ==0)){
				if (n != (power.length - 1)) {
					System.out.print(factor[n] + "+");
				} else {
					System.out.print(factor[n]);
				}
			}
		}
	}
}
