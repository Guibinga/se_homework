package example;

/*
* ����Ĺ���ʵ���࣬�������������ʵ��������󣬲�����
* */
public class CDFactory implements PotFactory{
  @Override
  public HotPot CreateFactory() {
      return new CDPot();
  }
}
