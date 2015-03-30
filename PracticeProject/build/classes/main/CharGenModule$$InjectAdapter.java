// Code generated by dagger-compiler.  Do not edit.
import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

/**
 * A {@code Binding<CharGenModule>} implementation which satisfies
 * Dagger's infrastructure requirements including:
 *
 * Owning the dependency links between {@code CharGenModule} and its
 * dependencies.
 *
 * Being a {@code Provider<CharGenModule>} and handling creation and
 * preparation of object instances.
 *
 * Being a {@code MembersInjector<CharGenModule>} and handling injection
 * of annotated fields.
 */
public final class CharGenModule$$InjectAdapter extends Binding<CharGenModule>
    implements Provider<CharGenModule>, MembersInjector<CharGenModule> {
  private Binding<String> name;
  private Binding<Integer> strength;

  public CharGenModule$$InjectAdapter() {
    super("CharGenModule", "members/CharGenModule", NOT_SINGLETON, CharGenModule.class);
  }

  /**
   * Used internally to link bindings/providers together at run time
   * according to their dependency graph.
   */
  @Override
  @SuppressWarnings("unchecked")
  public void attach(Linker linker) {
    name = (Binding<String>) linker.requestBinding("java.lang.String", CharGenModule.class, getClass().getClassLoader());
    strength = (Binding<Integer>) linker.requestBinding("java.lang.Integer", CharGenModule.class, getClass().getClassLoader());
  }

  /**
   * Used internally obtain dependency information, such as for cyclical
   * graph detection.
   */
  @Override
  public void getDependencies(Set<Binding<?>> getBindings, Set<Binding<?>> injectMembersBindings) {
    injectMembersBindings.add(name);
    injectMembersBindings.add(strength);
  }

  /**
   * Returns the fully provisioned instance satisfying the contract for
   * {@code Provider<CharGenModule>}.
   */
  @Override
  public CharGenModule get() {
    CharGenModule result = new CharGenModule();
    injectMembers(result);
    return result;
  }

  /**
   * Injects any {@code @Inject} annotated fields in the given instance,
   * satisfying the contract for {@code Provider<CharGenModule>}.
   */
  @Override
  public void injectMembers(CharGenModule object) {
    object.name = name.get();
    object.strength = strength.get();
  }

}
