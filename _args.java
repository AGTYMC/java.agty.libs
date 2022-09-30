package agty.libs;

import java.util.HashMap;

public class _args {
    private static final HashMap<String, String> args = new HashMap<>();
    private static boolean argsIsSet = false;

    /**
     * Setter
     *
     * @param arguments
     */
    public static void set(String arguments) {

        if (!argsIsSet) {
            String[] argsArr = arguments.split("&");

            for(String arg : argsArr) {
                if (arg.contains("=")) {
                    String[] $val = arg.split("=");
                    args.put($val[0], $val[1]);
                }
            }

            argsIsSet = true;
        }

    }

    /**
     * Getter
     */
    public static String get(String arg) {
        return args.get(arg);
    }
}
