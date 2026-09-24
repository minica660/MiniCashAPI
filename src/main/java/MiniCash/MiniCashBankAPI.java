package MiniCash;

import MiniCash.dto.MoneyLogPageResponseDTO;
import MiniCash.dto.PayResponseDTO;
import MiniCash.dto.PlayerData;
import org.bukkit.OfflinePlayer;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

public interface MiniCashBankAPI {

//    @Override
//    public void onEnable() {
//        // Plugin startup logic
//    }
//
//    @Override
//    public void onDisable() {
//        // Plugin shutdown logic


    /**
     * 指定したユーザーの口座があればそこからデータを取得、なければ生成して取得
     * @param uuid 対象プレイヤーのUUID
     * &#064;return　取得したプレイヤーのデータ
     */
    CompletableFuture<BankAPIResult<PlayerData>> getOrCreateBalance(UUID uuid);


    /**
     * 電子マネーのDeposit(入金)処理
     * @param player  対象プレイヤー
     * @param user  操作したユーザー名
     * @param amount  金額
     * @param pluginName  操作プラグイン名
     * @param reason 理由
     * @return WebAPI通信後のプレイヤーのデータ
     */
    CompletableFuture<BankAPIResult<PlayerData>> deposit(OfflinePlayer player,String user , int amount , String pluginName , String reason);


    /**
     * 電子マネーのWithdraw(出金)処理
     * @param player  対象プレイヤー
     * @param user  操作したユーザー名
     * @param amount  金額
     * @param pluginName  操作プラグイン名
     * @param reason　理由
     * @return WebAPI通信後のプレイヤーのデータ
     */
    CompletableFuture<BankAPIResult<PlayerData>> withdraw(OfflinePlayer player, String user , int amount , String pluginName , String reason);


    /**
     * 銀行のDeposit(入金)処理
     * @param player　対象プレイヤー
     * @param user　操作したユーザー名
     * @param amount　金額
     * @param pluginName　操作プラグイン名
     * @param reason　理由
     * @return WebAPI通信後のプレイヤーのデータ
     */
    CompletableFuture<BankAPIResult<PlayerData>> bankDeposit(OfflinePlayer player, String user, int amount, String pluginName, String reason);

    /**
     * 銀行のWithdraw(出金)処理
     * @param player　対象プレイヤー
     * @param user　操作したユーザー名
     * @param amount　金額
     * @param pluginName　操作プラグイン名
     * @param reason　理由
     * @return WebAPI通信後のプレイヤーのデータ
     */
    CompletableFuture<BankAPIResult<PlayerData>> bankWithdraw(OfflinePlayer player, String user, int amount, String pluginName, String reason);



    /**
     *  電子マネーから銀行へ
     *  銀行から電子マネーへ
     *  所持金を移行させます
     * @param player  操作対象のプレイヤー
     * @param user    操作したユーザー名
     * @param goType  どちらに移動させるか
     * @param amount  操作額
     * @param pluginName  操作のプラグイン名
     * @return 操作後のプレイヤーのデータが返ります
     */
    CompletableFuture<BankAPIResult<PlayerData>> transfer(OfflinePlayer player , String user , AssetType goType , int amount , String pluginName);


    CompletableFuture<BankAPIResult<PayResponseDTO>> pay(UUID fromUUID, UUID toUUID, String user, int amount, String pluginName);



    CompletableFuture<BankAPIResult<MoneyLogPageResponseDTO>> getPlayerLogs(UUID playerUUID, int page, int size);

    CompletableFuture<BankAPIResult<PlayerData>> getStatus(UUID uuid);

    CompletableFuture<BankAPIResult<PlayerData>> setFreezeStatus(UUID playerUUID, boolean freeze , String user , String pluginName);


    CompletableFuture<BankAPIResult<PlayerData>> edit(OfflinePlayer player, String user, AssetType type,ActionType action, int amount, String pluginName);









}