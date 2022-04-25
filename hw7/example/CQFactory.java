package example;

public class CQFactory implements PotFactory{
	  @Override
	  public HotPot CreateFactory() {
	      return new CQPot();
	  }
	}
