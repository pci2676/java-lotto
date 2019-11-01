import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class SafeNumberTest {

    @Test
    void 숫자만들기() {
        SafeNumber safeNumber = new SafeNumber(1);
        assertThat(safeNumber).isEqualTo(new SafeNumber(1));
    }

    @Test
    void 음수일경우_RuntimeException() {
        assertThatThrownBy(() -> new SafeNumber(-1))
                .isInstanceOf(RuntimeException.class)
                .hasMessage("-1 : 음수는 허용되지 않습니다.");
    }

}
