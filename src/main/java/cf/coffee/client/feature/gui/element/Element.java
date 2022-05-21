package cf.coffee.client.feature.gui.element;

import cf.coffee.client.helper.render.Rectangle;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import net.minecraft.client.util.math.MatrixStack;
import org.apache.logging.log4j.core.config.plugins.validation.constraints.Required;

public abstract class Element {
    @Getter
    @Setter
    protected double positionX, positionY, width, height;

    public Rectangle getBounds() {
        return new Rectangle(getPositionX(), getPositionY(), getPositionX()+getWidth(), getPositionY()+getHeight());
    }

    public Element(double x, double y, double width, double height) {
        setPositionX(x);
        setPositionY(y);
        setWidth(width);
        setHeight(height);
    }

    public abstract void tickAnimations();

    public abstract void render(MatrixStack stack, double mouseX, double mouseY);

    public abstract boolean mouseClicked(double x, double y, int button);

    public abstract boolean mouseReleased(double x, double y, int button);

    public abstract boolean mouseDragged(double x, double y, double xDelta, double yDelta, int button);

    public abstract boolean charTyped(char c, int mods);

    public abstract boolean keyPressed(int keyCode, int mods);

    public abstract boolean keyReleased(int keyCode, int mods);

    public abstract boolean mouseScrolled(double x, double y, double amount);

    public boolean inBounds(double x, double y) {
        return getBounds().contains(x, y);
    }
}