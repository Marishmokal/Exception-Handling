package pro.wings.exception;

public class ToYoungException extends RuntimeException {

	public ToYoungException(String s) {
		super(s);
	}
}
class ToOldException extends RuntimeException
{
	public ToOldException(String s)
	{
		super(s);
	}
}
