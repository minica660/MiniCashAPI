package MiniCash;

import org.bukkit.OfflinePlayer;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public interface MiniCashBankAPI {





    CompletableFuture<BankAPIResult<PlayerData>> getBalance(UUID uuid);
    CompletableFuture<BankAPIResult<PlayerData>> deposit(OfflinePlayer player, String user, int amount, String pluginName);
    CompletableFuture<BankAPIResult<PlayerData>> withdraw(OfflinePlayer player, String user, int amount, String pluginName);



}
