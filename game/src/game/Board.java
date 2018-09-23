package game;

public class Board {
	char[][] board = {{'□','□','□'},{'□','□','□'},{'□','□','□'}};

	void changefigure(int tmpY, int tmpX, char tmpFigure) throws ArrayIndexOutOfBoundsException{
		if(board[tmpY][tmpX] == '□'){
		board[tmpY][tmpX] = tmpFigure;
		}else{
			System.out.println("既に入力されています");
			GameMain.count--;
		}
	}

	void dispBoard(){
		for(char[] i: board){
			for(char j : i){
				System.out.print("[" + j + "]");
			}
			System.out.println();
		}
	}
}
