package bg.o.sim.dropplett

import android.graphics.Rect
import android.graphics.drawable.Drawable
import android.view.MotionEvent
import android.view.View
import android.widget.TextView


class CompoundDrawableTouchListener(
    val onDrawableClick: (drawableIndex: Int) -> Unit
) : View.OnTouchListener {

    companion object {
        const val LEFT = 0
        const val TOP = 1
        const val RIGHT = 2
        const val BOTTOM = 3
        private val DRAWABLE_INDEXES = intArrayOf(LEFT, TOP, RIGHT, BOTTOM)
    }

    override fun onTouch(view: View, event: MotionEvent): Boolean {
        if (event.action != MotionEvent.ACTION_UP)
            return false;

        view as TextView
        val drawables = view.compoundDrawables

        for (drawableIndex in DRAWABLE_INDEXES) {
            val bounds = getRelativeBounds(drawableIndex, drawables[drawableIndex]!!, view)

            if (bounds.contains(event.x.toInt(), event.y.toInt())) {
                onDrawableClick(drawableIndex)
                return true
            }
        }


        return false
    }

    /**
     * Calculates compound drawable bounds relative to wrapping view
     * @param index compound drawable index
     * @param drawable the drawable
     * @param view wrapping view
     * @return [Rect] with relative bounds
     */
    private fun getRelativeBounds(index: Int, drawable: Drawable, view: View): Rect {
        val bounds = Rect(drawable.bounds)
        when (index) {
            LEFT -> bounds.offsetTo(
                view.paddingLeft,
                view.height / 2 - bounds.height() / 2
            )
            TOP -> bounds.offsetTo(
                view.width / 2 - bounds.width() / 2,
                view.paddingTop
            )
            RIGHT -> bounds.offsetTo(
                view.width - view.paddingRight - bounds.width(),
                view.height / 2 - bounds.height() / 2
            )
            BOTTOM -> bounds.offsetTo(
                view.width / 2 - bounds.width() / 2,
                view.height - view.paddingBottom - bounds.height()
            )
        }
        return bounds
    }

    /**
     * Expands [Rect] by given value in every direction relative to its center
     * @param source given [Rect]
     * @return result [Rect]
     */
    protected open fun addFuzz(source: Rect): Rect? {
        val result = Rect()
        result.left = source.left
        result.right = source.right
        result.top = source.top
        result.bottom = source.bottom
        return result
    }
}