package bits.lottery.model;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class Player {
    private String address;
    private BigDecimal ethers;
}
