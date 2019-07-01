package torcherino.api;

@FunctionalInterface
public interface TorcherinoBlacklistInitializer
{
	/**
	 * Here you should only blacklist blocks or block entities, this can be done
	 * in your ModInitializer, however using this in a separate class will not need Torcherino API to be bundled at all.
	 * Please don't access the Torcherino Blacklist Impl class directly, use the TorcherinoBlacklistAPI.INSTANCE variable.
	 *
	 * @since 1.8.49
	 */
	void onTorcherinoBlacklist();
}
