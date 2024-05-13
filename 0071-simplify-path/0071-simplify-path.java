import java.util.*;

class Solution {
    public String simplifyPath(String path) {
        List<String> split = List.of(path.split("/"));
		StringBuilder stringBuilder = new StringBuilder();
		Stack<String> paths = new Stack<>();

		for (int i = 0; i < split.size(); i++) {
			if (!split.get(i).isBlank() && !split.get(i).equals(".") && !split.get(i)
					.equals("..")) {
				paths.add(split.get(i));
			}
			if (split.get(i).equals("..")) {
				if (!paths.isEmpty()) {
					paths.pop();
				}
			}
		}
		stringBuilder.append("/");
		for (int i = 0; i < paths.size(); i++) {
			stringBuilder.append(paths.get(i));
			if (i != paths.size() - 1) {
				stringBuilder.append("/");
			}
		}
		return stringBuilder.toString();
    }
}