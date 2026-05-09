package MiniCash;

import org.bukkit.OfflinePlayer;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public interface MiniCashBankAPI {

    CompletableFuture<BankAPIResult<Boolean>> has(UUID uuid);

    CompletableFuture<BankAPIResult<PlayerData>> addTable(OfflinePlayer player,String user,String pluginName);


    CompletableFuture<BankAPIResult<PlayerData>> getBalance(UUID uuid);
    CompletableFuture<BankAPIResult<PlayerData>> getEmoney(UUID uuid);
    CompletableFuture<BankAPIResult<PlayerData>> getBank(UUID uuid);
    CompletableFuture<BankAPIResult<PlayerData>> getPoint(UUID uuid);
    CompletableFuture<BankAPIResult<PlayerData>> getPlayerLog(UUID uuid,String user,String pluginName);
    CompletableFuture<BankAPIResult<PlayerData>> getLog(UUID uuid,String user,String pluginName);

    CompletableFuture<BankAPIResult<PlayerData>> getStatus(UUID uuid,String user,String pluginName);


    CompletableFuture<BankAPIResult<PlayerData>> edit(OfflinePlayer player, String user, String type,String action, int amount, String pluginName);

    CompletableFuture<BankAPIResult<PlayerData>> deposit(OfflinePlayer player, String user, int amount, String pluginName);
    CompletableFuture<BankAPIResult<PlayerData>> withdraw(OfflinePlayer player, String user, int amount, String pluginName);

    // editの簡略化版
    // spendメソッドは電子マネーからただ引き出すwithdraw
    // debitメソッドは銀行からただ引き出すwithdraw
    CompletableFuture<BankAPIResult<PlayerData>> spend(OfflinePlayer player, String user, int amount, String pluginName);
    CompletableFuture<BankAPIResult<PlayerData>> debit(OfflinePlayer player, String user, int amount, String pluginName);



    CompletableFuture<BankAPIResult<PayResponseDTO>> pay(UUID fromUUID,UUID toUUID,String user, int amount, String pluginName);




}
