package base180830;

/**
 * 会唱歌的人
 * @author chengzi
 *
 */
public class SingerPerson extends Person{
	/** 唱了几年 */
	private int singerYear;
	public SingerPerson(String name,int age,int singerYear){
		super(name,age);
		this.singerYear = singerYear;
	}
	@Override
	public String getPerson(){
		return super.getPerson() + "   唱歌多年:"+singerYear;
	}
	public static void main(String[] args){
		SingerPerson singer = new SingerPerson("黄秀兰",29,5);
		System.out.println(singer.getPerson());
	}
}
