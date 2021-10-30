package bits.lottery.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import bits.lottery.model.Balance;
import bits.lottery.model.Player;
import bits.lottery.service.BitsLotteryService;

@RestController
public class BitsLotteryController {

    private final BitsLotteryService lotteryService;

    @Autowired
    public BitsLotteryController(BitsLotteryService lotteryService) {
        this.lotteryService = lotteryService;
    }

    @GetMapping("/lottery/balance")
    public Balance getLotteryBalance() throws IOException {
        return new Balance(lotteryService.getBalance());
    }

    @PostMapping("/lottery/join")
    public void joinLottery(@RequestBody Player player) throws Exception {
        lotteryService.join(player);
    }
}
