package game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coordinate {
	String message = "軸の値を入力してください";
	int coordinate;
	int input(char crd) throws IOException, NumberFormatException{
		System.out.print(crd + message);
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String buf = br.readLine();
		coordinate = Integer.parseInt(buf);
		if(coordinate < 0 || coordinate > 2 ){
			input(crd);
		}
		return coordinate;
	}
}

