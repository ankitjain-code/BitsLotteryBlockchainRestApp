package bits.lottery.model;

import java.math.BigDecimal;
import java.math.BigInteger;

import bits.lottery.utils.BitsUtils;
import lombok.Getter;

@Getter
public class Balance {

    private final BigInteger wei;
    private final BigDecimal ether;

    public Balance(BigInteger wei) {
        this.wei = wei;
        this.ether = BitsUtils.toEther(wei);
    }
}
