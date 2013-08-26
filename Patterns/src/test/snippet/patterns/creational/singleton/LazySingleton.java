package test.snippet.patterns.creational.singleton;

public class LazySingleton {
	private static volatile LazySingleton helper = null;
	private static Object lock = new Object();

	public static LazySingleton getHelper() {
		if (helper == null) {
			synchronized (lock) {
				if (helper == null)
					helper = new LazySingleton();
			}
		}
		return helper;
	}

}
