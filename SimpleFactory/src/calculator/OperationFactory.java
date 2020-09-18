package calculator;

public class OperationFactory {
public static Operation getInstance(String oper) {
	switch (oper) {
	case "+":
		return new OperationAdd();
	case "-":
		return new OperationSub();
	case "*":
		return new OperationMul();
	case "/":
		return new OperationDiv();
	default:
		throw new LawlessValuesException("‘ÀÀ„∑˚Œﬁ–ß£°");
	}
}
}
