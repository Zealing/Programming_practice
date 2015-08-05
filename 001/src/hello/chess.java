package hello;

import java.util.Scanner;

public class chess {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String result = null;
		System.out.print("please enter size: ");
		final int size= in.nextInt();
//		final int size = 4;
		
		int [][] board = new int [size][size];
		boolean XResult = false;
		boolean OResult = false;
		int numOfX = 0;
		int numOfO = 0;
		
		System.out.println("please enter matrix: ");
		for (int i = 0; i<board.length; i++){
			for (int j = 0; j < board[i].length; j++){
				board[i][j] = in.nextInt();
			}
		}
		
//		检查行
		for (int i = 0; i<board.length; i++){
			for (int j = 0; j < board[i].length; j++){
				if (board[i][j] == 1){
					numOfX ++;
				} else{
					numOfO ++;
				}
			}
			
			if (numOfX == size ){
				XResult = true;
				numOfX = 0;
				numOfO = 0;
//				break;
			} else if (numOfO == size){
				OResult = true;
				numOfX = 0;
				numOfO = 0;
			}
			else {
				numOfX = 0;
				numOfO = 0;
			}
		}
		
//		检查列
		for (int i = 0; i<size; i++){
			for (int j = 0; j < size; j++){
				if (board[j][i] == 1){
					numOfX ++;
				} else{
					numOfO ++;
				}
			}
			
			if (numOfX == size ){
				XResult = true;
				numOfX = 0;
				numOfO = 0;
//				break;
			} else if (numOfO == size){
				OResult = true;
				numOfX = 0;
				numOfO = 0;
			}
			else {
				numOfX = 0;
				numOfO = 0;
			}
		}
		
//		检查对角线
		for (int i = 0; i < size; i++){
			if (board[i][i] == 1){
				numOfX ++;
			} else{
				numOfO ++;
			}
		}
		if (numOfX == size ){
			XResult = true;
			numOfX = 0;
			numOfO = 0;
		} else if (numOfO == size){
			OResult = true;
			numOfX = 0;
			numOfO = 0;
		}
		else {
			numOfX = 0;
			numOfO = 0;
		}
		for (int i = 0; i < size; i++){
			if (board[i][size - i - 1] == 1){
				numOfX ++;
			} else{
				numOfO ++;
			}
		}
		if (numOfX == size ){
			XResult = true;
			numOfX = 0;
			numOfO = 0;
		} else if (numOfO == size){
			OResult = true;
			numOfX = 0;
			numOfO = 0;
		}
		else {
			numOfX = 0;
			numOfO = 0;
		}
		
//		输出结果
		if ((XResult == false) && (OResult == false)) {
//			System.out.println("NIL");
			result = "NIL";
		} else if (XResult && !OResult) {
//			System.out.println("X");
			result = "X";
		} else if (!XResult && OResult) {
//			System.out.println("O");
			result = "O";
		} else {
//			System.out.println("error input");
			result = "error input";
		}
		System.out.println(result);
		
	}
}
