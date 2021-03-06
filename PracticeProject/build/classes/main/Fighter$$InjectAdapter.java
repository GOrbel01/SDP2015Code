// Code generated by dagger-compiler.  Do not edit.
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

/**
 * A {@code Binding<Fighter>} implementation which satisfies
 * Dagger's infrastructure requirements including:
 *
 * Owning the dependency links between {@code Fighter} and its
 * dependencies.
 *
 * Being a {@code Provider<Fighter>} and handling creation and
 * preparation of object instances.
 */
public final class Fighter$$InjectAdapter extends Binding<Fighter>
    implements Provider<Fighter> {
  private Binding<String> name;
  private Binding<Integer> strength;

  public Fighter$$InjectAdapter() {
    super("Fighter", "members/Fighter", NOT_SINGLETON, Fighter.class);
  }

  /**
   * Used internally to link bindings/providers together at run time
   * according to their dependency graph.
   */
  @Override
  @SuppressWarnings("unchecked")
  public void attach(Linker linker) {
    name = (Binding<String>) linker.requestBinding("java.lang.String", Fighter.class, getClass().getClassLoader());
    strength = (Binding<Integer>) linker.requestBinding("java.lang.Integer", Fighter.class, getClass().getClassLoader());
  }

  /**
   * Used internally obtain dependency information, such as for cyclical
   * graph detection.
   */
  @Override
  public void getDependencies(Set<Binding<?>> getBindings, Set<Binding<?>> injectMembersBindings) {
    getBindings.add(name);
    getBindings.add(strength);
  }

  /**
   * Returns the fully provisioned instance satisfying the contract for
   * {@code Provider<Fighter>}.
   */
  @Override
  public Fighter get() {
    Fighter result = new Fighter(name.get(), strength.get());
    return result;
  }

}
