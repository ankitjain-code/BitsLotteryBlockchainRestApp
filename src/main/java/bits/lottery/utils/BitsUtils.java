package bits.lottery.utils;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.web3j.utils.Convert;
import org.web3j.utils.Convert.Unit;

public class BitsUtils {
    public static BigDecimal toEther(BigInteger wei) {
        return Convert.fromWei(new BigDecimal(wei), Unit.ETHER);
    }
}
