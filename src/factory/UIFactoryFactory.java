package factory;

public class UIFactoryFactory {
    public static UIFactory getUIFactory(SupportedPlatform supportedPlatform) {
        if(supportedPlatform == SupportedPlatform.ANDROID) {
            return new AndroidUIFactory();
        } else if(supportedPlatform == SupportedPlatform.IOS) {
            return new IOSUIFactory();
        }

        return new AndroidUIFactory();
    }
}
