package nl.youngcapital.atm.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LambdaDemo {
	public static <T> List<T> map(ArrayList<T> data, Function<T, T> f) {
		return data.stream().map(f).collect(Collectors.toList());

	}

	public static void main(String[] args) {
		ArrayList<Double> ar = new ArrayList<>();
		ArrayList<String> ars = new ArrayList<>();
		for (Double x = 0.0; x < 100; ++x) {
			ar.add(x);
			ars.add(x.toString());
		}

		System.out.println(

				map(ar, i -> i % 50)

		);
		System.out.println(map(ars, i -> i + ""));

	}
}
