// Code generated by dagger-compiler.  Do not edit.
import dagger.internal.BindingsGroup;
import dagger.internal.ModuleAdapter;
import dagger.internal.ProvidesBinding;
import javax.inject.Provider;

/**
 * A manager of modules and provides adapters allowing for proper linking and
 * instance provision of types served by {@code @Provides} methods.
 */
public final class CharGenModule$$ModuleAdapter extends ModuleAdapter<CharGenModule> {
  private static final String[] INJECTS = { "members/RunTest", };
  private static final Class<?>[] STATIC_INJECTIONS = { };
  private static final Class<?>[] INCLUDES = { CharModule.class, };

  public CharGenModule$$ModuleAdapter() {
    super(CharGenModule.class, INJECTS, STATIC_INJECTIONS, false /*overrides*/, INCLUDES, true /*complete*/, false /*library*/);
  }

  @Override
  public CharGenModule newModule() {
    return new CharGenModule();
  }

  /**
   * Used internally obtain dependency information, such as for cyclical
   * graph detection.
   */
  @Override
  public void getBindings(BindingsGroup bindings, CharGenModule module) {
    bindings.contributeProvidesBinding("java.lang.String", new ProvideNameProvidesAdapter(module));
    bindings.contributeProvidesBinding("java.lang.Integer", new ProvideStrengthProvidesAdapter(module));
  }

  /**
   * A {@code Binding<java.lang.String>} implementation which satisfies
   * Dagger's infrastructure requirements including:
   *
   * Being a {@code Provider<java.lang.String>} and handling creation and
   * preparation of object instances.
   */
  public static final class ProvideNameProvidesAdapter extends ProvidesBinding<String>
      implements Provider<String> {
    private final CharGenModule module;

    public ProvideNameProvidesAdapter(CharGenModule module) {
      super("java.lang.String", NOT_SINGLETON, "CharGenModule", "provideName");
      this.module = module;
      setLibrary(false);
    }

    /**
     * Returns the fully provisioned instance satisfying the contract for
     * {@code Provider<java.lang.String>}.
     */
    @Override
    public String get() {
      return module.provideName();
    }
  }

  /**
   * A {@code Binding<java.lang.Integer>} implementation which satisfies
   * Dagger's infrastructure requirements including:
   *
   * Being a {@code Provider<java.lang.Integer>} and handling creation and
   * preparation of object instances.
   */
  public static final class ProvideStrengthProvidesAdapter extends ProvidesBinding<Integer>
      implements Provider<Integer> {
    private final CharGenModule module;

    public ProvideStrengthProvidesAdapter(CharGenModule module) {
      super("java.lang.Integer", NOT_SINGLETON, "CharGenModule", "provideStrength");
      this.module = module;
      setLibrary(false);
    }

    /**
     * Returns the fully provisioned instance satisfying the contract for
     * {@code Provider<java.lang.Integer>}.
     */
    @Override
    public Integer get() {
      return module.provideStrength();
    }
  }
}