package cuigh.lambda;

public class Lambda2ParameterTest {

	public static void main(String[] args) {
		
		Lambda2Parameter l2p = (n,m) -> ( (n % m) == 0 );
		System.out.println(l2p.test(5, 3));
		System.out.println(l2p.test(15, 3));
		
		l2p = (n,m) -> ( (n - m) == 0 );
		System.out.println(l2p.test(5, 3));
		System.out.println(l2p.test(15, 15));
		
		l2p = (n,m) -> ( (n * m) == 0 );
		System.out.println(l2p.test(5, 0));
		System.out.println(l2p.test(15, 3));
	}

}
