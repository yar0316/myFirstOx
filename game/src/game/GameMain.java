package game;

import java.io.IOException;

public class GameMain {
	static int count = 0;
	public static void main(String[] args){
		Coordinate cd = new Coordinate();
		Board brd = new Board();
		Judge jdg = new Judge();
		String vicOrDef = "ゲーム中";
		int x = -1;
		int y = -1;
		char cr = '□';

		while(vicOrDef.equals("ゲーム中")){
			count++;
			try{
				y = cd.input('Y');
				x = cd.input('X');
				if(count % 2 == 1){
					cr = '○';
					brd.changefigure(y, x, cr);
				}else{
					cr = '×';
					brd.changefigure(y, x, cr);
				}
			}catch(IOException | ArrayIndexOutOfBoundsException e){
				e.printStackTrace();
			}catch(NumberFormatException e){
				count--;
				continue;
			}
			brd.dispBoard();
			vicOrDef = jdg.drawJudge(brd.board);
			vicOrDef = jdg.slantJudge(brd.board);
			vicOrDef = jdg.judge(brd.board);
		}
		if(vicOrDef.equals("の勝ちです")) {vicOrDef = cr + vicOrDef;}
		System.out.println(vicOrDef);
	}
}
