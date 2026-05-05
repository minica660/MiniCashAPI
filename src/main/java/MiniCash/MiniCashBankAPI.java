package MiniCash;

import org.bukkit.OfflinePlayer;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public interface MiniCashBankAPI {

    CompletableFuture<BankAPIResult<PlayerData>> has(UUID uuid);

    CompletableFuture<BankAPIResult<PlayerData>> getBalance(UUID uuid);
    CompletableFuture<BankAPIResult<PlayerData>> getEmoney(UUID uuid);
    CompletableFuture<BankAPIResult<PlayerData>> getBank(UUID uuid);
    CompletableFuture<BankAPIResult<PlayerData>> getPoint(UUID uuid);



    CompletableFuture<BankAPIResult<PlayerData>> deposit(OfflinePlayer player, String user, int amount, String pluginName);
    CompletableFuture<BankAPIResult<PlayerData>> withdraw(OfflinePlayer player, String user, int amount, String pluginName);

    CompletableFuture<BankAPIResult<PlayerData>> getPlayerLog(UUID uuid);
    CompletableFuture<BankAPIResult<PlayerData>> getLog(UUID uuid);

    CompletableFuture<BankAPIResult<PlayerData>> getStatus(UUID uuid);



}
