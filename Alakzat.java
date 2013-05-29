
package alakzatok;

/**
 *
 * @author egyed.sandor_1
 */
abstract class Alakzat
{
int x,y;   

Alakzat(int x, int y)
{
this.x = x;
this.y = y;
}    

abstract int terulet();

abstract int kerulet();

}
