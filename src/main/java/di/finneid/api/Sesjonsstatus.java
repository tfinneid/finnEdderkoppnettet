package di.finneid.api;

import java.util.List;

public record Sesjonsstatus(List<String> sessionIds) {

    @Override
    public String toString() {
        return "Sesjonsstatus{" +
                "sessionIds=" + sessionIds +
                '}';
    }
}
