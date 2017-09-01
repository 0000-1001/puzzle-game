package com.example.ghulamquadir.onoff;


        import android.app.Activity;
        import android.content.Context;
        import android.graphics.Canvas;
        import android.graphics.Color;
        import android.graphics.Paint;
        import android.os.Bundle;
        import android.util.DisplayMetrics;
        import android.view.MotionEvent;
        import android.view.View;


public class MainActivity extends Activity {

    int height,width,diameter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(new MyView(this));


        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        height = displayMetrics.heightPixels;
        width = displayMetrics.widthPixels;
        diameter = width/5;
    }

    public class MyView extends View{
        public MyView(Context context) {
            super(context);
            // TODO Auto-generated constructor stub

        }

        int color,flag=-1;
        float x=0,y=0;
        int f1=0, f2=0, f3=1, f4=1, f5=1, f6=0, f7=1, f8=0, f9=1,
                f10=1, f11=1, f12=1, f13=0, f14=1, f15=0, f16=1,f17=0,
                f18=0, f19=0, f20=1, f21=0, f22=1, f23=1, f24=0, f25=1;
        Paint paint = new Paint();

        public void onDraw(Canvas canvas) {
            // TODO Auto-generated method stub
            super.onDraw(canvas);

            if (f1 == 0) {
                paint.setColor(Color.BLACK);
            } else if (f1 == 1) {
                paint.setColor(Color.RED);
            }
            canvas.drawCircle(0*diameter+diameter/2,0*diameter+200+diameter/2,diameter/2,paint);
            if (f2 == 0) {
                paint.setColor(Color.BLACK);
            } else if (f2 == 1) {
                paint.setColor(Color.RED);
            }
            canvas.drawCircle(1*diameter+diameter/2,0*diameter+200+diameter/2,diameter/2,paint);
            if (f3 == 0) {
                paint.setColor(Color.BLACK);
            } else if (f3 == 1) {
                paint.setColor(Color.RED);
            }
            canvas.drawCircle(2*diameter+diameter/2,0*diameter+200+diameter/2,diameter/2,paint);
            if (f4 == 0) {
                paint.setColor(Color.BLACK);
            } else if (f4 == 1) {
                paint.setColor(Color.RED);
            }
            canvas.drawCircle(3*diameter+diameter/2,0*diameter+200+diameter/2,diameter/2,paint);
            if (f5 == 0) {
                paint.setColor(Color.BLACK);
            } else if (f5 == 1) {
                paint.setColor(Color.RED);
            }
            canvas.drawCircle(4*diameter+diameter/2,0*diameter+200+diameter/2,diameter/2,paint);
            if (f6 == 0) {
                paint.setColor(Color.BLACK);
            } else if (f6 == 1) {
                paint.setColor(Color.RED);
            }
            canvas.drawCircle(0*diameter+diameter/2,1*diameter+200+diameter/2,diameter/2,paint);
            if (f7 == 0) {
                paint.setColor(Color.BLACK);
            } else if (f7 == 1) {
                paint.setColor(Color.RED);
            }
            canvas.drawCircle(1*diameter+diameter/2,1*diameter+200+diameter/2,diameter/2,paint);
            if (f8 == 0) {
                paint.setColor(Color.BLACK);
            } else if (f8 == 1) {
                paint.setColor(Color.RED);
            }
            canvas.drawCircle(2*diameter+diameter/2,1*diameter+200+diameter/2,diameter/2,paint);
            if (f9 == 0) {
                paint.setColor(Color.BLACK);
            } else if (f9 == 1) {
                paint.setColor(Color.RED);
            }
            canvas.drawCircle(3*diameter+diameter/2,1*diameter+200+diameter/2,diameter/2,paint);
            if (f10 == 0) {
                paint.setColor(Color.BLACK);
            } else if (f10 == 1) {
                paint.setColor(Color.RED);
            }
            canvas.drawCircle(4*diameter+diameter/2,1*diameter+200+diameter/2,diameter/2,paint);
            if (f11 == 0) {
                paint.setColor(Color.BLACK);
            } else if (f11 == 1) {
                paint.setColor(Color.RED);
            }
            canvas.drawCircle(0*diameter+diameter/2,2*diameter+200+diameter/2,diameter/2,paint);
            if (f12 == 0) {
                paint.setColor(Color.BLACK);
            } else if (f12 == 1) {
                paint.setColor(Color.RED);
            }
            canvas.drawCircle(1*diameter+diameter/2,2*diameter+200+diameter/2,diameter/2,paint);
            if (f13 == 0) {
                paint.setColor(Color.BLACK);
            } else if (f13 == 1) {
                paint.setColor(Color.RED);
            }
            canvas.drawCircle(2*diameter+diameter/2,2*diameter+200+diameter/2,diameter/2,paint);
            if (f14 == 0) {
                paint.setColor(Color.BLACK);
            } else if (f14 == 1) {
                paint.setColor(Color.RED);
            }
            canvas.drawCircle(3*diameter+diameter/2,2*diameter+200+diameter/2,diameter/2,paint);
            if (f15 == 0) {
                paint.setColor(Color.BLACK);
            } else if (f15 == 1) {
                paint.setColor(Color.RED);
            }
            canvas.drawCircle(4*diameter+diameter/2,2*diameter+200+diameter/2,diameter/2,paint);
            if (f16 == 0) {
                paint.setColor(Color.BLACK);
            } else if (f16 == 1) {
                paint.setColor(Color.RED);
            }
            canvas.drawCircle(0*diameter+diameter/2,3*diameter+200+diameter/2,diameter/2,paint);
            if (f17 == 0) {
                paint.setColor(Color.BLACK);
            } else if (f17 == 1) {
                paint.setColor(Color.RED);
            }
            canvas.drawCircle(1*diameter+diameter/2,3*diameter+200+diameter/2,diameter/2,paint);
            if (f18 == 0) {
                paint.setColor(Color.BLACK);
            } else if (f18 == 1) {
                paint.setColor(Color.RED);
            }
            canvas.drawCircle(2*diameter+diameter/2,3*diameter+200+diameter/2,diameter/2,paint);
            if (f19 == 0) {
                paint.setColor(Color.BLACK);
            } else if (f19 == 1) {
                paint.setColor(Color.RED);
            }
            canvas.drawCircle(3*diameter+diameter/2,3*diameter+200+diameter/2,diameter/2,paint);
            if (f20 == 0) {
                paint.setColor(Color.BLACK);
            } else if (f20 == 1) {
                paint.setColor(Color.RED);
            }
            canvas.drawCircle(4*diameter+diameter/2,3*diameter+200+diameter/2,diameter/2,paint);
            if (f21 == 0) {
                paint.setColor(Color.BLACK);
            } else if (f21 == 1) {
                paint.setColor(Color.RED);
            }
            canvas.drawCircle(0*diameter+diameter/2,4*diameter+200+diameter/2,diameter/2,paint);
            if (f22 == 0) {
                paint.setColor(Color.BLACK);
                f22 = 0;
            } else if (f22 == 1) {
                paint.setColor(Color.RED);
            }
            canvas.drawCircle(1*diameter+diameter/2,4*diameter+200+diameter/2,diameter/2,paint);
            if (f23 == 0) {
                paint.setColor(Color.BLACK);
            } else if (f23 == 1) {
                paint.setColor(Color.RED);
            }
            canvas.drawCircle(2*diameter+diameter/2,4*diameter+200+diameter/2,diameter/2,paint);
            if (f24 == 0) {
                paint.setColor(Color.BLACK);
            } else if (f24 == 1) {
                paint.setColor(Color.RED);
            }
            canvas.drawCircle(3*diameter+diameter/2,4*diameter+200+diameter/2,diameter/2,paint);
            if (f25 == 0) {
                paint.setColor(Color.BLACK);
            } else if (f25 == 1) {
                paint.setColor(Color.RED);
            }
            canvas.drawCircle(4*diameter+diameter/2,4*diameter+200+diameter/2,diameter/2,paint);

            paint.setColor(Color.GREEN);
            canvas.drawRect(diameter, 200+5*diameter+80, width-diameter, 200+5*diameter+230, paint);
            paint.setTextSize(40);
            paint.setColor(Color.WHITE);
            canvas.drawText("RESTART", 0, 7, diameter+130, height-190, paint);
            if(flag==-1){
                paint.setColor(Color.BLACK);
                paint.setTextSize(130);
                canvas.drawText("LEVEL 1", 0, 7, width/5, 150, paint);
            }
            else if(flag==1){
                paint.setColor(Color.GREEN);
                paint.setTextSize(25);
                canvas.drawText("CONGRATULATION", 0, 14, 125, 120, paint);
            }
        }
        @Override
        public boolean onTouchEvent(MotionEvent me) {
            // TODO Auto-generated method stub
            Canvas canvas = new Canvas();
            Paint paint = new Paint();
            if (me.getAction() == me.ACTION_UP) {
                float x = me.getX();
                float y = me.getY();
                if (x >= 0 && x <= diameter && y >= 200 && y <= 200+diameter&&flag!=1) {
                    System.out.println("ghulam");
                    if (f1 == 0)
                        f1=1;
                    else
                        f1=0;
                    if (f2 == 0)
                        f2=1;
                    else
                        f2=0;
                    if (f6 == 0)
                        f6=1;
                    else
                        f6=0;
                }
                else if (x >=diameter && x <= 2*diameter && y >= 200 && y <= 200+diameter&&flag!=1) {
                    if (f2 == 0)
                        f2=1;
                    else
                        f2=0;
                    if (f1 == 0)
                        f1=1;
                    else
                        f1=0;
                    if (f7 == 0)
                        f7=1;
                    else
                        f7=0;
                    if(f3==0)
                        f3=1;
                    else
                        f3=0;
                }
                if (x >= 2*diameter && x <= 3*diameter && y >= 200 && y <= 200+diameter&&flag!=1) {
                    if (f3 == 0)
                        f3=1;
                    else
                        f3=0;
                    if (f2 == 0)
                        f2=1;
                    else
                        f2=0;
                    if (f8 == 0)
                        f8=1;
                    else
                        f8=0;
                    if(f4 == 0)
                        f4=1;
                    else
                        f4=0;
                }
                if (x >= 3*diameter && x <= 4*diameter && y >= 200 && y <= 200+diameter&&flag!=1) {
                    if (f4 == 0)
                        f4=1;
                    else
                        f4=0;
                    if (f3 == 0)
                        f3=1;
                    else
                        f3=0;
                    if (f9 == 0)
                        f9=1;
                    else
                        f9=0;
                    if(f5 == 0)
                        f5=1;
                    else
                        f5=0;
                }
                if (x >= 4*diameter && x <= 5*diameter && y >= 200 && y <= 200+diameter&&flag!=1) {
                    if (f5 == 0)
                        f5=1;
                    else
                        f5=0;
                    if (f4 == 0)
                        f4=1;
                    else
                        f4=0;
                    if (f10 == 0)
                        f10=1;
                    else
                        f10=0;
                }
                if (x >= 40 && x <= 110 && y >= 245 && y <= 315&&flag!=1) {
                    if (f1 == 0)
                        f1=1;
                    else
                        f1=0;
                    if (f7 == 0)
                        f7=1;
                    else
                        f7=0;
                    if (f6 == 0)
                        f6=1;
                    else
                        f6=0;
                    if(f11 == 0)
                        f11=1;
                    else
                        f11=0;
                }
                else if (x >=125 && x <= 195 && y >= 245 && y <= 315&&flag!=1) {
                    if (f2 == 0)
                        f2=1;
                    else
                        f2=0;
                    if (f6 == 0)
                        f6=1;
                    else
                        f6=0;
                    if (f7 == 0)
                        f7=1;
                    else
                        f7=0;
                    if(f8 == 0)
                        f8=1;
                    else
                        f8=0;
                    if(f12==0)
                        f12=1;
                    else
                        f12=0;
                }
                if (x >= 210 && x <= 280 && y >= 245 && y <= 315&&flag!=1) {
                    if (f3 == 0)
                        f3=1;
                    else
                        f3=0;
                    if (f7 == 0)
                        f7=1;
                    else
                        f7=0;
                    if (f8 == 0)
                        f8=1;
                    else
                        f8=0;
                    if(f13 == 0)
                        f13=1;
                    else
                        f13=0;
                    if(f9 == 0)
                        f9=1;
                    else
                        f9=0;
                }
                if (x >= 295 && x <= 365 && y >= 245 && y <= 315&&flag!=1) {
                    if (f4 == 0)
                        f4=1;
                    else
                        f4=0;
                    if (f8 == 0)
                        f8=1;
                    else
                        f8=0;
                    if (f9 == 0)
                        f9=1;
                    else
                        f9=0;
                    if(f10 == 0)
                        f10=1;
                    else
                        f10=0;
                    if(f14 == 0)
                        f14=1;
                    else
                        f14=0;
                }
                if (x >= 380 && x <=450  && y >= 245 && y <= 315&&flag!=1) {
                    if (f5 == 0)
                        f5=1;
                    else
                        f5=0;
                    if (f9 == 0)
                        f9=1;
                    else
                        f9=0;
                    if (f10 == 0)
                        f10=1;
                    else
                        f10=0;
                    if(f15 == 0)
                        f15=1;
                    else
                        f15=0;
                }
                if (x >= 40 && x <= 110 && y >= 330 && y <= 400&&flag!=1) {
                    if (f12 == 0)
                        f12=1;
                    else
                        f12=0;
                    if (f16 == 0)
                        f16=1;
                    else
                        f16=0;
                    if (f6 == 0)
                        f6=1;
                    else
                        f6=0;
                    if(f11 == 0)
                        f11=1;
                    else
                        f11=0;
                }
                else if (x >=125 && x <= 195 && y >= 330 && y <= 400&&flag!=1) {
                    if (f7 == 0)
                        f7=1;
                    else
                        f7=0;
                    if (f11 == 0)
                        f11=1;
                    else
                        f11=0;
                    if (f12 == 0)
                        f12=1;
                    else
                        f12=0;
                    if(f13 == 0)
                        f13=1;
                    else
                        f13=0;
                    if(f17==0)
                        f17=1;
                    else
                        f17=0;
                }
                if (x >= 210 && x <= 280 && y >= 330 && y <= 400&&flag!=1) {
                    if (f14 == 0)
                        f14=1;
                    else
                        f14=0;
                    if (f18 == 0)
                        f18=1;
                    else
                        f18=0;
                    if (f12 == 0)
                        f12=1;
                    else
                        f12=0;
                    if(f13 == 0)
                        f13=1;
                    else
                        f13=0;
                    if(f8 == 0)
                        f8=1;
                    else
                        f8=0;
                }
                if (x >= 295 && x <= 365 && y >= 330 && y <= 400&&flag!=1) {
                    if (f15 == 0)
                        f15=1;
                    else
                        f15=0;
                    if (f13 == 0)
                        f13=1;
                    else
                        f13=0;
                    if (f19 == 0)
                        f19=1;
                    else
                        f19=0;
                    if(f9 == 0)
                        f9=1;
                    else
                        f9=0;
                    if(f14 == 0)
                        f14=1;
                    else
                        f14=0;
                }
                if (x >= 380 && x <=450  && y >= 330 && y <= 400&&flag!=1) {
                    if (f20 == 0)
                        f20=1;
                    else
                        f20=0;
                    if (f14 == 0)
                        f14=1;
                    else
                        f14=0;
                    if (f10 == 0)
                        f10=1;
                    else
                        f10=0;
                    if(f15 == 0)
                        f15=1;
                    else
                        f15=0;
                }
                if (x >= 40 && x <= 110 && y >= 415 && y <= 485&&flag!=1) {
                    if (f17 == 0)
                        f17=1;
                    else
                        f17=0;
                    if (f16 == 0)
                        f16=1;
                    else
                        f16=0;
                    if (f21 == 0)
                        f21=1;
                    else
                        f21=0;
                    if(f11 == 0)
                        f11=1;
                    else
                        f11=0;
                }
                else if (x >=125 && x <= 195 && y >= 415 && y <= 485&&flag!=1) {
                    if (f16 == 0)
                        f16=1;
                    else
                        f16=0;
                    if (f18 == 0)
                        f18=1;
                    else
                        f18=0;
                    if (f22 == 0)
                        f22=1;
                    else
                        f22=0;
                    if(f12 == 0)
                        f12=1;
                    else
                        f12=0;
                    if(f17==0)
                        f17=1;
                    else
                        f17=0;
                }
                if (x >= 210 && x <= 280 && y >= 415 && y <= 485&&flag!=1) {
                    if (f19 == 0)
                        f19=1;
                    else
                        f19=0;
                    if (f18 == 0)
                        f18=1;
                    else
                        f18=0;
                    if (f17 == 0)
                        f17=1;
                    else
                        f17=0;
                    if(f13 == 0)
                        f13=1;
                    else
                        f13=0;
                    if(f23 == 0)
                        f23=1;
                    else
                        f23=0;
                }
                if (x >= 295 && x <= 365 && y >= 415 && y <= 485&&flag!=1) {
                    if (f18 == 0)
                        f18=1;
                    else
                        f18=0;
                    if (f20 == 0)
                        f20=1;
                    else
                        f20=0;
                    if (f19 == 0)
                        f19=1;
                    else
                        f19=0;
                    if(f24 == 0)
                        f24=1;
                    else
                        f24=0;
                    if(f14 == 0)
                        f14=1;
                    else
                        f14=0;
                }
                if (x >= 380 && x <=450  && y >= 415 && y <= 485&&flag!=1) {
                    if (f20 == 0)
                        f20=1;
                    else
                        f20=0;
                    if (f19 == 0)
                        f19=1;
                    else
                        f19=0;
                    if (f15 == 0)
                        f15=1;
                    else
                        f15=0;
                    if(f25 == 0)
                        f25=1;
                    else
                        f25=0;
                }
                if (x >= 40 && x <= 110 && y >= 500 && y <= 570&&flag!=1) {
                    if (f22 == 0)
                        f22=1;
                    else
                        f22=0;
                    if (f16 == 0)
                        f16=1;
                    else
                        f16=0;
                    if (f21 == 0)
                        f21=1;
                    else
                        f21=0;
                }
                else if (x >=125 && x <= 195 && y >= 500 && y <= 570&&flag!=1) {
                    if (f23 == 0)
                        f23=1;
                    else
                        f23=0;
                    if (f22 == 0)
                        f22=1;
                    else
                        f22=0;
                    if(f21 == 0)
                        f21=1;
                    else
                        f21=0;
                    if(f17==0)
                        f17=1;
                    else
                        f17=0;
                }
                if (x >= 210 && x <= 280 && y >= 500 && y <= 570&&flag!=1) {
                    if (f22 == 0)
                        f22=1;
                    else
                        f22=0;
                    if (f18 == 0)
                        f18=1;
                    else
                        f18=0;
                    if (f24 == 0)
                        f24=1;
                    else
                        f24=0;
                    if(f23 == 0)
                        f23=1;
                    else
                        f23=0;
                }
                if (x >= 295 && x <= 365 && y >= 500 && y <= 570&&flag!=1) {
                    if (f23 == 0)
                        f23=1;
                    else
                        f23=0;
                    if (f25 == 0)
                        f25=1;
                    else
                        f25=0;
                    if (f19 == 0)
                        f19=1;
                    else
                        f19=0;
                    if(f24 == 0)
                        f24=1;
                    else
                        f24=0;
                }
                if (x >= 380 && x <=450  && y >= 500 && y <= 570&&flag!=1) {
                    if (f20 == 0)
                        f20=1;
                    else
                        f20=0;
                    if (f24 == 0)
                        f24=1;
                    else
                        f24=0;
                    if(f25 == 0)
                        f25=1;
                    else
                        f25=0;
                }
                if(x >= 40 && x <= 450 && y >= 640 && y<= 720){
                    restart();
                }
                invalidate();
                check();
            }
            return true;
        }
        private void restart() {
            // TODO Auto-generated method stub
            f1=0;
            f2=0;
            f3=1;
            f4=1;
            f5=1;
            f6=0;
            f7=1;
            f8=0;
            f9=1;
            f10=1;
            f11=1;
            f12=1;
            f13=0;
            f14=1;
            f15=0;
            f16=1;
            f17=0;
            f18=0;
            f19=0;
            f20=1;
            f21=0;
            f22=1;
            f23=1;
            f24=0;
            f25=1;
            invalidate();
        }
        private void check() {
            // TODO Auto-generated method stub
            if((f1==1&&f2==1&&f3==1&&f4==1&&f5==1&&f6==1&&f7==1&&f8==1
                    &&f9==1&&f10==1&&f11==1&&f12==1&&f13==1&&f14==1&&f15==1
                    &&f16==1&&f17==1&&f18==1&&f19==1&&f20==1&&f21==1&&f22==1
                    &&f23==1&&f24==1&&f25==1)||(f1==0&&f2==0&&f3==0&&f4==0
                    &&f5==0&&f6==0&&f7==0&&f8==0&&f9==0&&f10==0&&f11==0&&f12==0
                    &&f13==0&&f14==0&&f15==0&&f16==0&&f17==0&&f18==0&&f19==0
                    &&f20==0&&f21==0&&f22==0&&f23==0&&f24==0&&f25==0)){
                flag=1;
                invalidate();
            }
        }
    }
}
