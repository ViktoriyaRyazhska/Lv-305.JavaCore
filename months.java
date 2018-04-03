package hm4;

import java.util.Scanner;

public class months {

	public static void main(String[] args) {
		System.out.println("Введіть число місяця");
		
		Scanner scan = new Scanner(System.in);
		
		int number = scan.nextInt();
		
		if(scan = 1) {
			System.out.println("Січень, 31 день");
		}
		if(scan = 2) {
			System.out.println("Лютий, 28/29 днів");
		}
		if(scan = 3) {
			System.out.println("Березень, 31 день");
		}
	    if(scan = 4) {
			System.out.println("Квітень, 30 день");
			}
		if(scan = 5) {
			System.out.println("Травень, 31 день");
				}
		if(scan = 6) {
			System.out.println("Червень, 31 день");
					}
		if(scan = 7) {
			System.out.println("Липень, 30 день");
					}
		if(scan = 8) {
			System.out.println("Серпень, 31 день");
					}
		if(scan = 9) {
			System.out.println("Вересень, 31 день");
					}
		if(scan = 10) {
			System.out.println("Жовтень, 31 день");
					}
		if(scan = 11) {
			System.out.println("Листопад, 30 день");
					}
		if(scan = 12) {
			System.out.println("Грудень, 31 день");
					}
		else {
			System.out.println("Ви ввели неправильне число");
		}
	}
	

	}


