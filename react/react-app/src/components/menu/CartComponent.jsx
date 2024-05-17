import CartItemComponent from "@components/cart/CartItemComponent"
import useCustomLogin from "@hooks/useCustomLogin"
import useCustomCart from "@hooks/useCustomCart";
import { useEffect, useMemo } from "react";

const CartComponent = () => {
  const {isLogin, loginState} = useCustomLogin();
  const {cartItems,  refreshCart, changeCart} = useCustomCart();
  useEffect(() => {
    if (isLogin) {
      refreshCart();
    }
  }, [isLogin])
  const total = useMemo(() => {

    let total = 0

    for(const item of cartItems) {
      total += item.price * item.qty
    }

    return total

  },[cartItems])
  return (
    <div className="w-full">
      {isLogin &&
        <div className="flex flex-col">
          
          <div className="w-full flex">
            <div className="font-extrabold text-2xl w-4/5">
              {loginState.nickname}'s Cart
            </div>
            <div className="bg-orange-600 text-center text-white font-bold w-1/5 rounded-full m-1">
              {cartItems.length}
            </div>
          </div>

          <div>
            <ul>
              {cartItems.map( item => 
                <CartItemComponent {...item} 
                key={item.cino} 
                changeCart ={changeCart} 
                email={loginState.email}/>)}
            </ul>
          </div>

          <div>
            <div className="text-2xl text-right font-extrabold">
              TOTAL: {total}
            </div>
          </div>
        </div>
      }
    </div>
  )
}

export default CartComponent;