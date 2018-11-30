package base180926.UUID;

import java.util.UUID;

public class CommonSelfIdGenerator implements IdGenerator{

	@Override
	public UUID generateId() {
//		return getUUIDString();
		return UUID.randomUUID().fromString("橙子");
	}

	private String getUUIDString() {
		return generateId().toString().replace("-", "");
	}

}
