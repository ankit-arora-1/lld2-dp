package adapter;

import adapter.thirdParty.IciciBankAPI;

public class ICICIBankAPIAdapter implements BankAPIAdapter {
    private IciciBankAPI iciciBankAPI = new IciciBankAPI();

    @Override
    public double getBalance(String accountNumber) {
//        String balance = iciciBankAPI.getBalance();
//        double doubleBalance = Double.parseDouble(balance);
//        return doubleBalance;
        return 0;
    }

    @Override
    public boolean sendMoney(String fromAccount, String toAccount, double amount) {
        return false;
    }
}
