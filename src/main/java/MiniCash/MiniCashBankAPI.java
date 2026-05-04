package MiniCash;

import org.bukkit.OfflinePlayer;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.UUID;

public interface MiniCashBankAPI {

//    @Override
//    public void onEnable() {
//        // Plugin startup logic
//    }
//
//    @Override
//    public void onDisable() {
//        // Plugin shutdown logic



    CompletableFuture<BankAPIResult<PlayerData>> getBalance(UUID uuid);
    CompletableFuture<BankAPIResult<PlayerData>> deposit(OfflinePlayer player, String user, int amount, String pluginName);
    CompletableFuture<BankAPIResult<PlayerData>> withdraw(OfflinePlayer player, String user, int amount, String pluginName);



}