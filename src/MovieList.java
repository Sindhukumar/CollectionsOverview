import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MovieList {

	public static void main(String[] args) {
		List<String> movies = new ArrayList<String>();
		String in;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter movie names:");
		in = sc.nextLine();
		while (!in.equalsIgnoreCase("")) {
			movies.add(in);
			in = sc.nextLine();
		}
		System.out.println("Your movies in sorted order:");
		Collections.sort(movies);
		for(String movie:movies){
			System.out.println(movie);
		}
		sc.close();
	}

}
