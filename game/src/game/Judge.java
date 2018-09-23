package game;

public class Judge {
	String[]messages = {"の勝ちです","引き分けです"};
	String rtMessage = "ゲーム中";
	char[] sl1 = new char[3];
	char[] sl2 = new char[3];

	String judge(char[][] tmpBoard){
		for(int i = 0; i < tmpBoard.length; i++){
			if(tmpBoard[i][0] != '□'){
				if(tmpBoard[i][0] == tmpBoard[i][1] && tmpBoard[i][0] == tmpBoard[i][2] ){
					rtMessage = messages[0];
				}else if(tmpBoard[0][i] == tmpBoard[1][i] && tmpBoard[0][i] == tmpBoard[2][i]){
					rtMessage = messages[0];
				}
			}
		}
		return rtMessage;
	}

	String slantJudge(char[][] tmpBoard){
		if(tmpBoard[1][1] != '□'){
			if(tmpBoard[0][0] == tmpBoard[1][1] && tmpBoard[0][0] == tmpBoard[2][2]){
				rtMessage = messages[0];
			}else if(tmpBoard[0][2] == tmpBoard[1][1] && tmpBoard[0][2] == tmpBoard[2][0]){
				rtMessage = messages[0];
			}
		}
		return rtMessage;
	}

	String drawJudge(char[][] tmpBoard){
		for(char[] j: tmpBoard){
			if(j[0] == '□' || j[1] == '□' || j[2] == '□'){
				break;
			}else{
				rtMessage =messages[1];
			}
		}
		return rtMessage;
	}

}

