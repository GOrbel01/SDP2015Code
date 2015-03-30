// Code generated by dagger-compiler.  Do not edit.
import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

/**
 * A {@code Binding<RunTest>} implementation which satisfies
 * Dagger's infrastructure requirements including:
 *
 * Owning the dependency links between {@code RunTest} and its
 * dependencies.
 *
 * Being a {@code Provider<RunTest>} and handling creation and
 * preparation of object instances.
 *
 * Being a {@code MembersInjector<RunTest>} and handling injection
 * of annotated fields.
 */
public final class RunTest$$InjectAdapter extends Binding<RunTest>
    implements Provider<RunTest>, MembersInjector<RunTest> {
  private Binding<FightSimulator> fs;

  public RunTest$$InjectAdapter() {
    super("RunTest", "members/RunTest", NOT_SINGLETON, RunTest.class);
  }

  /**
   * Used internally to link bindings/providers together at run time
   * according to their dependency graph.
   */
  @Override
  @SuppressWarnings("unchecked")
  public void attach(Linker linker) {
    fs = (Binding<FightSimulator>) linker.requestBinding("FightSimulator", RunTest.class, getClass().getClassLoader());
  }

  /**
   * Used internally obtain dependency information, such as for cyclical
   * graph detection.
   */
  @Override
  public void getDependencies(Set<Binding<?>> getBindings, Set<Binding<?>> injectMembersBindings) {
    injectMembersBindings.add(fs);
  }

  /**
   * Returns the fully provisioned instance satisfying the contract for
   * {@code Provider<RunTest>}.
   */
  @Override
  public RunTest get() {
    RunTest result = new RunTest();
    injectMembers(result);
    return result;
  }

  /**
   * Injects any {@code @Inject} annotated fields in the given instance,
   * satisfying the contract for {@code Provider<RunTest>}.
   */
  @Override
  public void injectMembers(RunTest object) {
    object.fs = fs.get();
  }

}