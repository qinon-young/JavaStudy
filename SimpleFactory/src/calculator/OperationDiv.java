package calculator;

public class OperationDiv extends Operation{

	@Override
	public int getResult() {
		// TODO Auto-generated method stub
		if(getNum2()==0) {
			throw new LawlessValuesException("��������Ϊ��");
		}
		return getNum1()/getNum2();
	}

}
