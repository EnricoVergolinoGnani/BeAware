/**
 *
 */
package pucrio.br.lac.model.dscep;

/**
 * @author vitor
 *
 */
public enum Unity
{
    SECONDS("s"), MINUTES("m"), HOURS("h"), DAYS("d");

    private String _unity;

    Unity(String unity)
    {
        _unity = unity;
    }

    public String getUnity()
    {
        return _unity;
    }
}