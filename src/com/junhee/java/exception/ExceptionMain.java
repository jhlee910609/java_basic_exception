package com.junhee.java.exception;

public class ExceptionMain {

	public static void main(String[] args) {

		// 예외 처리 try-catch;
		// 에러가 발생했을 때, 프로그램이 다운되지 말고 계속 실행하기 위해 사용하는 클래스.
	
		// 로컬 안에서 식별자 선언해줘야 함. 
		int array[] = new int[6]; 

		try {
			// 실행시킬 로직 작성
			
			array[0] = 31;
			array[5] = 10;
			// 에러가 발생하더라도 결과값을 리턴해야한다.
			// array[6] = 11; > 오류가 날 경우, 아래 코드 실행시키지 않는다. 
			//
			int x = 1/0;  // 0으로 나눠서 에러가 떴음. 오류 날 경우, 바로 예외처리하러 가버림.
			String s = "adfa";
			int a = Integer.parseInt(s);
			array[7] = 0;

			// (예외 종류 이름 e) >
		} catch (ArrayIndexOutOfBoundsException nameOfException) {
			// 에러를 출력하는 여러 방법 중 하나.
			// 아래처럼 사용할 경우, 에러를 다른 스레드에 던지고 계속 프로그램 실.
			nameOfException.printStackTrace();

			// 스레드 개념 공부.
			// 아래처럼 코딩하면 안됨. 
			// system.out.print(e.toString());
			
			// if문처럼 조건을 걸 수 있음.
		} catch(ArithmeticException e) {
			e.printStackTrace();
		
		} finally {
			System.out.println("다섯 번째 값 =" + array[5]);
		}
		System.out.println("시스템이 완료되었습니다.");
	}
}
