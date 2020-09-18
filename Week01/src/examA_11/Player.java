package examA_11;

import java.util.ArrayList;

public class Player {
	
public ArrayList<String> getSong() {
		return song;
	}

	public void setSong(ArrayList<String> song) {
		this.song = song;
	}
	public void setSong(String song) {
		this.song.add(song);
	}
private ArrayList<String> song=new ArrayList<String>();

public String play(int index) throws NoThisSongException {
	if(index>5) {
		throw new NoThisSongException("您播放的歌曲不存在!");
	}
	return song.get(index-1);
}
}
