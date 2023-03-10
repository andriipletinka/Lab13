package visitor;

import java.util.Map;

public interface Visitor<T> {
    Map<String, String> onSignature(Task task);
    Map<String, String> onGroupStart(Task task);
    Map<String, String> onGroupEnd(Task task);
}
