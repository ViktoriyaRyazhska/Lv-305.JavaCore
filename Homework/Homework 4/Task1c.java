import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task1c {
	public enum HTTPError {
		Informationalresponses, SuccesOperstions, Redirection, Clienterrors
	};

	public static void main(String[] args) throws NumberFormatException, IOException {
		// read number of HTTP Error (400, 401,402, ...) and write the name of this
		// error (Declare enum HTTPError)

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HTTPError httperror;
		System.out.println("Please enter number of your error");
		int error = Integer.parseInt(br.readLine());
		switch (error) {
		case 100:
		case 101:
		case 102:
		case 103:
			httperror = HTTPError.Informationalresponses;
			System.out.println(httperror);
			break;
		case 200:
		case 201:
		case 202:
		case 203:
		case 204:
		case 205:
		case 206:
		case 207:
		case 208:
		case 226:
			httperror = HTTPError.SuccesOperstions;
			System.out.println(httperror);
			break;
		case 300:
		case 301:
		case 302:
		case 303:
		case 304:
		case 305:
		case 306:
		case 307:
		case 308:
			httperror = HTTPError.Redirection;
			System.out.println(httperror);
			break;
		case 400:
		case 401:
		case 402:
		case 403:
		case 404:
		case 405:
		case 406:
		case 407:
		case 408:
		case 451:
			httperror = HTTPError.Clienterrors;
			System.out.println(httperror);
			break;
		default:
			System.out.println("Server Errors");
			System.exit(0);

		}
	}

}
