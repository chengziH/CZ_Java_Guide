package base180926.UUID;

import java.util.UUID;

public class CreateUUID {
	public static void main(String[] agrs){
		UUID uuid = UUID.randomUUID();
		System.out.println(uuid);
		System.out.println(UUID.nameUUIDFromBytes(uuid.toString().replace("-", "").getBytes()));
	}
	
	public static String getUUID(){
		return UUID.randomUUID().toString().replace("-", "");
	}
}
