package edu.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Error {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int error = Integer.parseInt(br.readLine());


        switch (error){
            case 400 :
                System.out.println(HTTPError.BAD_REQUEST);
                break;
            case 401 :
                System.out.println(HTTPError.UNAUTHORIZED);
                break;
            case 402 :
                System.out.println(HTTPError.PAYMENT_REQUIRED);
                break;
            default:
                System.out.println("wrong");
        }
    }
}
