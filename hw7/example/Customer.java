package example;
//����
/*
* ������
* ���ǹ˿ͣ���ѡ��������
* */
public class Customer {
	public static void main(String[] args) {
		//1.��ȥ����ꡣ ����һ����������
		HotPotStore hotPotStore =new HotPotStore();
		//2.�����˵�Ա��Ҫ�ɶ���������ɳɶ����׹�������ʵ��
		CDFactory cdFactory =new CDFactory();
		//3.�����������ĳɶ����״ӿⷿ�õ�������ö�̬������ʵ�������󴫽�ȥ
		hotPotStore.setPotFactory(cdFactory);
		//4.���ɶ����׷Ž�������÷��������ɵ�ʵ�������󷵻س�����
		HotPot hotPot = hotPotStore.ChooseHot();
		//5.�ѻ�������������������ʵ����������Ӧ�Ĳ���
		System.out.println(hotPot.getName());
  }
}
