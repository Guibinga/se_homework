package example;
/*
* ����������ṩ���ͻ�ѡ�����ֹ���
* */
public class HotPotStore {
	//�����ȴ���һ���������������Եı��������ں�����÷���
	  private  PotFactory potFactory;
	  //�ٸ�������Ը�ֵ�����ö�̬��˼�롣��������ָ���������ʱ������������ʱ��ʹ������ķ���������
	  public void setPotFactory(PotFactory potFactory) {
	      this.potFactory = potFactory;
	  }
	  //ͨ������������ض�Ӧ����ʵ������
	  public HotPot ChooseHot(){
	      return  potFactory.CreateFactory();
	  }
}
