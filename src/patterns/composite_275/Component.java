package patterns.composite_275;

//抽象组件
public interface Component {
    void operation();
}
//叶子组件
interface Leaf extends Component{

}
//容器组件
interface Composite extends Component{

}
